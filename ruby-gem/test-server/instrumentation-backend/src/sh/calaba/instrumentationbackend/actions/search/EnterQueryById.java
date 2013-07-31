package sh.calaba.instrumentationbackend.actions.search;

import android.annotation.TargetApi;
import android.os.Build;
import android.widget.SearchView;
import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class EnterQueryById implements Action{

    @Override
    public Result execute(String... args) {

        final String query = args[0];
        final SearchView view = (SearchView) InstrumentationBackend.solo.getView(args[1]);
        view.setQuery(query, true);

        return Result.successResult();
    }

    @Override
    public String key() {
        return "enter_query_into_id_field";
    }
}
