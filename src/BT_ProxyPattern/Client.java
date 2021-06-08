package BT_ProxyPattern;

public class Client {

    public static void main(String[] args) {
        String url = "https://msmobile.com.vn/upload_images/images/hinh-nen-one-piece-cho-may-tinh-2.jpg";
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36";
        String destination = "luffy.jpg";

        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(userAgent, url, destination);
    }
}
