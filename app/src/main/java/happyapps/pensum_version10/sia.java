package happyapps.pensum_version10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class sia extends AppCompatActivity {
    WebView webview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sia);

        webview1=(WebView)findViewById(R.id.webView1);
        Bundle bundle = getIntent().getExtras();




        webview1.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }});

        webview1.loadUrl("http://acad.ucaldas.edu.co/Default.aspx");
        webview1.getSettings().setUseWideViewPort(true);
        webview1.getSettings().setLoadWithOverviewMode(true);
        webview1.getSettings().setBuiltInZoomControls(true);

    }
}
