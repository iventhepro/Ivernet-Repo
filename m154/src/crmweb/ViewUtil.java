package crmweb;

import io.javalin.http.Handler;

public class ViewUtil {

    public static Handler notFound = ctx -> {
        ctx.render(Path.Template.NOT_FOUND);
    };

}
