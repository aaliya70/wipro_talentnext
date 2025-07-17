import java.util.ArrayList;
import java.util.Scanner;

class Video {
    private String title;
    private boolean checkedOut;
    private double rating;
    private int ratingCount;

    public Video(String title) {
        this.title = title;
        this.checkedOut = false;
        this.rating = 0.0;
        this.ratingCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already rented out.");
        }
    }

    public void returnVideo() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not rented out.");
        }
    }

    public void rateVideo(int rating) {
        this.rating = ((this.rating * ratingCount) + rating) / (++ratingCount);
        System.out.println("Thanks for rating! New average rating for " + title + " is: " + this.rating);
    }

    public void displayInfo() {
        System.out.printf("Title: %-20s | Rating: %.1f | Available: %s\n",
                title, rating, checkedOut ? "No" : "Yes");
    }
}

class VideoStore {
    private ArrayList<Video> inventory;

    public VideoStore() {
        inventory = new ArrayList<>();
    }

    public void addVideo(String title) {
        inventory.add(new Video(title));
        System.out.println("Video \"" + title + "\" added to inventory.");
    }

    public void checkOutVideo(String title) {
        Video video = findVideo(title);
        if (video != null) {
            video.checkOut();
        } else {
            System.out.println("Video not found.");
        }
    }

    public void returnVideo(String title) {
        Video video = findVideo(title);
        if (video != null) {
            video.returnVideo();
        } else {
            System.out.println("Video not found.");
        }
    }

    public void rateVideo(String title, int rating) {
        Video video = findVideo(title);
        if (video != null) {
            video.rateVideo(rating);
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No videos in inventory.");
            return;
        }
        System.out.println("\nCurrent Inventory:");
        for (Video video : inventory) {
            video.displayInfo();
        }
    }

    private Video findVideo(String title) {
        for (Video v : inventory) {
            if (v.getTitle().equalsIgnoreCase(title)) {
                return v;
            }
        }
        return null;
    }
}

public class Miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("\n========= Video Rental Inventory Menu =========");
            System.out.println("1. Add Video");
            System.out.println("2. Rent Video");
            System.out.println("3. Return Video");
            System.out.println("4. Rate Video");
            System.out.println("5. List Inventory");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter video title to add: ");
                    String addTitle = sc.nextLine();
                    store.addVideo(addTitle);
                    break;

                case 2:
                    System.out.print("Enter video title to rent: ");
                    String rentTitle = sc.nextLine();
                    store.checkOutVideo(rentTitle);
                    break;

                case 3:
                    System.out.print("Enter video title to return: ");
                    String returnTitle = sc.nextLine();
                    store.returnVideo(returnTitle);
                    break;

                case 4:
                    System.out.print("Enter video title to rate: ");
                    String rateTitle = sc.nextLine();
                    System.out.print("Enter rating (1 to 5): ");
                    int rating = sc.nextInt();
                    store.rateVideo(rateTitle, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 0:
                    System.out.println("Thank you for using Video Rental System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
