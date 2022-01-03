package Assignment2;

//Task_4: 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression.

public class Task_4 {
    public static void main(String[] args) {
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " " );
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = str.split(" ");
        double sharee_price = Double.parseDouble(arr[1]);
        double shirt_price = Double.parseDouble(arr[3]);
        double pant_price = Double.parseDouble(arr[5]);

        double quantityOfSharee = Double.parseDouble(arr[0]);
        double quantityOfShirt = Double.parseDouble(arr[2]);
        double quantityOfPant = Double.parseDouble(arr[4]);

        double totalPrice = sharee_price + shirt_price + pant_price;
        double totalQuantity = quantityOfSharee + quantityOfShirt + quantityOfPant;
        System.out.println("Total Quantity Is: "+totalQuantity);
        System.out.println("Total Price IS: "+totalPrice);
    }
}
