package labelnet.cn.sysdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import labelnet.cn.sysdemo.R;

/**
 * Created by yuan on 2016/10/11.
 */

public class ZramFragment extends Fragment{

    public static ZramFragment getInstance(){
        return new ZramFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((TextView)view.findViewById(R.id.frag_tv)).setText("ZramFragment");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.style2,menu);
        super.onCreateOptionsMenu(menu,inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.ui_menu_setting:
                showMsg("ZramFragment 设置");
                break;
            case R.id.ui_menu_help:
                showMsg("ZramFragment 帮助");
                break;
        }
        return true;
    }

    private void showMsg(String msg){
        Snackbar.make(getView(),msg,Snackbar.LENGTH_LONG).show();
    }

}
