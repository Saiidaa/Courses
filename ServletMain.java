package servlet;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


public class ServletMain{
    private static int ID = 0;

    private static final Map<Integer,String> map = new HashMap<Integer, String>();
    private static final Map<String, Integer> mapp = new HashMap<String, Integer>();

    public static void LogUserstore(HttpSession session, UserAccount logUser){
        session.setAttribute("logUser", logUser);

    }

    public static UserAccount getLogUser(HttpSession session) {
        UserAccount logUser = (UserAccount) session.getAttribute("logUser");
        return logUser;
    }
}
