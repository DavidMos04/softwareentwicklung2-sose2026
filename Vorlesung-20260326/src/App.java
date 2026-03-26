public class App {
    public static void main(String[] args) throws Exception {
        Button button1 = new Button();
        System.out.println("-------------------");
        Button button2 = new Button(100, 100);
        System.out.println("-------------------");
        Button button3 = new Button(0, 0, 100, 100);
    }

    Button button1 = new Button();
    Button button2 = new Button(100, 50);
    Button button3 = new Button(10, 20, 100, 50);
    
}
