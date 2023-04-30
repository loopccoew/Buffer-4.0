package DSL;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Message {
	private int msgId;
	private String sender;
	private String receiver;
	private String msg;
	private String User;

	private int nextMessageId = 1;

	public Message(String sender, String receiver, String msg) {
		this.msgId = nextMessageId++;
		this.sender = sender;
		this.receiver = receiver;
		this.msg = msg;
	}

	public int getNextMessageId() {

		return nextMessageId;
	}

	public void setNextMessageId(int nextMessageId) {

		this.nextMessageId = nextMessageId;
	}

	public int getMessageId() {
		msgId = nextMessageId++;
		return msgId;
	}

	public String getSender() {
		return sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsgId(int msgId) {
		msgId = nextMessageId++;
		this.msgId = msgId;
	}
}

public class MessagingSystem {

	private Queue<Message> msgQueue;
	private Stack<Message> msgStack;
	private Queue<Message> undoMsgQueue;

	public MessagingSystem() {
		this.msgQueue = new LinkedList<>();
		this.msgStack = new Stack<>();
		this.undoMsgQueue = new LinkedList<>();
	}

	public void sendMessage(Message message) {
		msgQueue.offer(message);
		// when a new message is sent, reset the undone message queue
		undoMsgQueue.clear();
		Message msg = new Message(null, null, null);
		System.out.println("Message ID = " + msg.getNextMessageId());
	}

	public Message receiveMsg() {
		if (!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();
			msgStack.push(message);
			return message;
		}
		return null;
	}

	public Message undoMsg() { // undo the last msg
		if (!msgStack.isEmpty()) {
			Message message = msgStack.pop();
			undoMsgQueue.offer(message);
			return message;
		}
		return null;
	}

	public Message redoMsg() { // redo the last message
		if (!undoMsgQueue.isEmpty()) {
			Message message = undoMsgQueue.poll();
			msgStack.push(message);
			return message;
		}
		return null;
	}

	public void deleteMessage(int messageId) {
		boolean messageFound = false;
		Iterator<Message> msgIterator = msgQueue.iterator();
		while (msgIterator.hasNext()) {
			Message currentMessage = msgIterator.next();
			if (currentMessage.getMessageId() == messageId) {
				msgIterator.remove();
				messageFound = true;
				System.out.println("Message with ID " + messageId + " deleted.");
				break;
			}
		}
		if (!messageFound) {
			System.out.println("Message with ID " + messageId + " not found.");
		}
	}

	// private int getMessageId() {
	// TODO Auto-generated method stub
	// return 0;
	// }

	public Message searchMessage(String keyword) {
		for (Message message : msgQueue) {
			if (message.getMsg().contains(keyword)) {
				return message;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MessagingSystem messagingSystem = new MessagingSystem();

		boolean quit = false;
		while (!quit) {
			System.out.println(
					"Choose an option:\n1. Send a message\n2. Receive a message\n3. Undo last message\n4. Redo last message\n5. Delete a message\n6. Search for a message\n7. Quit");
			int option = scanner.nextInt();
			scanner.nextLine(); // consume the newline character

			switch (option) {
			case 1:
				System.out.print("Enter sender name: ");
				String sender = scanner.nextLine();
				System.out.print("Enter receiver name: ");
				String receiver = scanner.nextLine();
				System.out.print("Enter message: ");
				String msgText = scanner.nextLine();

				messagingSystem.sendMessage(new Message(sender, receiver, msgText));
				break;
			case 2:
				Message receivedMessage = messagingSystem.receiveMsg();
				if (receivedMessage != null) {
					// System.out.println("Message ID = "+Message.getMessageId());
					System.out.println("Message received from " + receivedMessage.getSender() + " to "
							+ receivedMessage.getReceiver() + ": " + receivedMessage.getMsg());
				} else {
					System.out.println("No messages to receive.");
				}
				break;
			case 3:
				Message undoneMessage = messagingSystem.undoMsg();
				if (undoneMessage != null) {
					System.out.println("Last message from " + undoneMessage.getSender() + " to "
							+ undoneMessage.getReceiver() + " undone.");
				} else {
					System.out.println("No messages to undo.");
				}
				break;
			case 4:
				Message redoMessage = messagingSystem.redoMsg();
				if (redoMessage != null) {
					System.out.println("Last message from " + redoMessage.getSender() + " to "
							+ redoMessage.getReceiver() + " redone.");
				} else {
					System.out.println("No messages to redo.");
				}
				break;
			case 5:
				System.out.print("Enter message ID to delete: ");
				int messageIdToDelete = scanner.nextInt();
				scanner.nextLine(); // consume the newline character
				messagingSystem.deleteMessage(messageIdToDelete);
				break;

			case 6:
				System.out.print("Enter keyword to search: ");
				String keyword = scanner.nextLine();
				Message foundMessage = messagingSystem.searchMessage(keyword);
				if (foundMessage != null) {
					System.out.println("Message found:\n" + foundMessage.getMsg());
				} else {
					System.out.println("No message found.");
				}
				break;
			case 7:
				quit = true;
				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
		}
		scanner.close();
	}
}
