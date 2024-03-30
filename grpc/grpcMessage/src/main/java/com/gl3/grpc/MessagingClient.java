package com.gl3.grpc;

import com.gl3.messaging.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class MessagingClient {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
                .usePlaintext()
                .build();
        MessagingServiceGrpc.MessagingServiceBlockingStub stub = MessagingServiceGrpc.newBlockingStub(channel);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. View Received Messages");
            System.out.println("2. Send a Message");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    MessagingServiceOuterClass.GetMessagesRequest getRequest = MessagingServiceOuterClass.GetMessagesRequest.newBuilder()
                            .setUser(username)
                            .build();
                    MessagingServiceOuterClass.GetMessagesResponse getResponse = stub.getMessages(getRequest);
                    System.out.println("Messages for " + username + ": " + getResponse.getMessagesList());
                    break;
                case 2:
                    System.out.print("Enter recipient's username: ");
                    String recipient = scanner.nextLine();
                    System.out.print("Enter your message: ");
                    String message = scanner.nextLine();

                    MessagingServiceOuterClass.SendMessageRequest sendRequest = MessagingServiceOuterClass.SendMessageRequest.newBuilder()
                            .setRecipient(recipient)
                            .setMessage(message)
                            .build();
                    MessagingServiceOuterClass.SendMessageResponse sendResponse = stub.sendMessage(sendRequest);
                    System.out.println("Message sent: " + sendResponse.getSuccess());
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        channel.shutdown();
    }
}