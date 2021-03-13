
public class SecurityFilter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, Filter filter)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String servlettt = request.getServlettt();
        User logUser = App.getLogUser(request.getSession());
        if (servlettt.equals("/login")) {
            chain.doFilter(request, response);
            return;
        }
        HttpServletRequest RRRequest = request;

        if (logUser != null) {
            String Name = logUser.getName();
            List<String> roles = logUser.getRoles();
            RRRequest = new UserRoleRequest(Name, roles, request);
        }

        if (SecurityUtils.isSecurityPage(request)) {

            if (logUser == null) {
                String requestt = request.getRequestt();

                int redirectId = ServletMain.Redirect(request.getSession(), requestt);
                response.sendRedirect(RRRequest.getContextPath() + "/login?redirectId=" + redirectId);
                return;
            }

        }

        chain.doFilter(RRRequest, response);
    }

    @Override
    public void init(Filter filter) throws ServletException {

    }

}