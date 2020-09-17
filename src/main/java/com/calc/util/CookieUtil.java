package com.calc.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	public String getUserName(HttpServletRequest request)  {
		String userName = "";
		if (request.getCookies() != null) {
          Cookie cookies[] = request.getCookies();
          for (Cookie cookie : cookies) {
            if (cookie.getName().equals("userName")) {
              userName = cookie.getValue();
              return userName;
            }
          }
        }
        return userName;
	}

	public void setCookieUserName(HttpServletResponse httpServletResponse,String userName)  {
		if(userName==null || userName.equals("")) {
			userName = "";
		}
		Cookie cookieUserName = new Cookie("userName", userName);
		int cookieMaxAge = 60*60*24*7;
		cookieUserName.setMaxAge(cookieMaxAge);
		httpServletResponse.addCookie(cookieUserName);

	}

}
