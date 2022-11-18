package My;

public class WiFiAdapter implements USB{
    WiFi wiFi;

    public WiFiAdapter(WiFi wiFi) {
        this.wiFi = wiFi;
    }

    @Override
    public void connectWithAdapter() {
        this.wiFi.insert();
        this.wiFi.connect();
    }
}
