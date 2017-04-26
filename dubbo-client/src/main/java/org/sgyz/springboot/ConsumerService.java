package org.sgyz.springboot;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by P0093203 on 2017/4/26.
 */
@Component
public class ConsumerService {

    @Reference(version = "1.0.0")
     HelloWorld h;

              public void printMessage() {
                String str="帅帅的";
             String message = h.hello(str);
               System.out.println(message);
          }

}
