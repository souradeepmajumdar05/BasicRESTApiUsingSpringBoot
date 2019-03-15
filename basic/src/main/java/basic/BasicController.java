package basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * RestController annotation is used to create RESTful web services in Spring MVC. 
 * This annotation takes care of mapping request data to the defined request handler method. 
 * Once response body is generated from the handler method, it converts it to JSON or XML response.
 * */
@RestController
public class BasicController 
{
    private static final String template = "Hello, %s!";
	private static final String dateTemplate = "Today's date is : %s";
    private final AtomicLong counter = new AtomicLong();
    
    /*
     * @RequestMapping  maps HTTP requests to handler methods of MVC and REST controllers.
     * This can be applied to class-level and/or method-level in a controller.
     * 
     * @RequestParam annotation is used with @RequestMapping to bind a web request parameter 
     * to the parameter of the handler method
     * */
    @RequestMapping("/basicTest")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) 
	{
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
	
	@RequestMapping("/date")
    public Greeting greeting() 
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
        return new Greeting(counter.incrementAndGet(), String.format(dateTemplate, dateFormat.format(date)));
    }
}
