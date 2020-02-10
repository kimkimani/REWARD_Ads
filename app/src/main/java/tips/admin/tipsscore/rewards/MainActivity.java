package tips.admin.tipsscore.rewards;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class MainActivity extends AppCompatActivity implements  RewardedVideoAdListener {
private RewardedVideoAd mAdd;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        mText = (TextView)findViewById ( R.id.textView );
        MobileAds.initialize ( getApplicationContext (),"ca-app-pub-3940256099942544~3347511713 " );
        mAdd= MobileAds.getRewardedVideoAdInstance ( this );
        mAdd.setRewardedVideoAdListener(this);
    }
    private void LoadRewardedVideoAd() {
        if ( !mAdd.isLoaded ())

            mAdd.loadAd ( "ca-app-pub-3940256099942544/5224354917",
                    new AdRequest.Builder().build() );
        {

        }

    }



     @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

        LoadRewardedVideoAd();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        mText.setText ( "C0INS:15");
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    protected void OnPause(){
        mAdd.pause ( this );
        super.onResume ();

    }
    protected void OnResume(){
        mAdd.resume ( this );
        super.onResume ();

    }
    protected void OnDestroy(){
        mAdd.destroy ( this );
        super.onResume ();

    }


    public void startVideoAdd(View view) {
                   if (mAdd.isLoaded ()){
                mAdd.show ();


            }

        }
    }
