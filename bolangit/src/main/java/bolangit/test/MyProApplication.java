package bolangit.test;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyProApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProApplication.class, args);
    }
    @Bean
    public static AutoJsonRpcServiceImplExporter autoJsonRpcServiceImplExporter() {
        AutoJsonRpcServiceImplExporter exp = new AutoJsonRpcServiceImplExporter();
        //in here you can provide custom HTTP status code providers etc. eg:
        //exp.setHttpStatusCodeProvider();
        //exp.setErrorResolver();
        return exp;
    }

}
