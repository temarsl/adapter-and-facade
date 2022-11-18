package My;

public class Main {
    public static void main(String[] args) {
        USB wifiAdapter = new WiFiAdapter(new WiFi());
        wifiAdapter.connectWithAdapter();
    }
}
