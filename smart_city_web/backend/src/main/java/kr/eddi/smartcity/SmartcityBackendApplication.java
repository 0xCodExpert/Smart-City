package kr.eddi.smartcity;

import kr.eddi.smartcity.utility.network.MainServerSocket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SmartcityBackendApplication {

    public static void main(String[] args) throws IOException {
        MainServerSocket mss = new MainServerSocket();
        mss.start();

        SpringApplication.run(SmartcityBackendApplication.class, args);
    }

}
