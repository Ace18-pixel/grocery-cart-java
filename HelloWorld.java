import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n🛒 Grocery Cart Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View cart");
            System.out.println("4. Get total items");
            System.out.println("5. Clear cart");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                System.out.print("Enter item name: ");
                String name = sc.nextLine();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();
                cart.add(name + " (x" + qty + ")");
                System.out.println(name + " added to cart.");
                break;

                case 2:
                System.out.print("Enter item name to remove: ");
                String removeName = sc.nextLine();
                boolean removed = false;
                for (int i = 0; i < cart.size(); i++) {
                    if (cart.get(i).toLowerCase().contains(removeName.toLowerCase())) {
                        cart.remove(i);
                        System.out.println(removeName + " removed from cart.");
                        removed = true;
                        break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Item not found in cart.");
                    }
                    break;
                    

                case 3:
                System.out.println("Cart:");
                for (int i = 0; i < cart.size(); i++) {
                    System.out.println("- " + cart.get(i));
                }
                break;

                case 4:
                System.out.println("Total items: ");
                int size = cart.size();
                System.out.println("Total number of items in the cart are "+ size);
                break;

                case 5:
                cart.clear();
                System.out.println("Your cart is clear");
                break;

                case 6:
                System.out.println("Thank you for using the Grocery Cart System!");
                System.exit(0);
                break;

                default:
                System.out.println("Invalid choice.");

                
                }
            }
        }
    }


