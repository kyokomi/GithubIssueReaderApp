package kyokomi.githubissuereader

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)

        def queue = Volley.newRequestQueue(this)
        queue.add(new StringRequest("https://api.github.com/repos/kyokomi/cocostudio_book/issues", {
            response -> Log.d("Request", response)
        }, {
            error -> Log.e("Request", error.getMessage(), error)
        }))

    }
}
