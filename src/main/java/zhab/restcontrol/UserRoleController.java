package zhab.restcontrol;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.jsoup.Connection.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zhab.model.*;

import java.util.*;


/**
 * Created by XZN on 2017/3/15.
 */

@RestController
@RequestMapping("/userRole")
public class UserRoleController {

    public static final ObjectMapper mapper = new ObjectMapper();

    @Value("${interfaceUrl.ipUrl}")
    protected String ipUrl;



}
