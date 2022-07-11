package progetto.mp.ligabue.martin;

 public class Test2 {
    public static void main(String[] args) {
        System.out.println("Enter Text : ");
        Test eventSource = new Test();
        
        eventSource.addObserver(event -> {
            System.out.println("Received response: " + event);
        });

        eventSource.scanSystemIn();
    }
} 