package edu.huflit.dapm_th_phongtro.UI.ToaNha;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/*import edu.huflit.dapm_th_phongtro.Adapter.PhongTroAdapter;*/
/*import edu.huflit.dapm_th_phongtro.AddPhongActivity;*/
import edu.huflit.dapm_th_phongtro.Database.DBHelper;
import edu.huflit.dapm_th_phongtro.Database.PhongTro;
/*import edu.huflit.dapm_th_phongtro.PhongChiTietActivity;*/
import edu.huflit.dapm_th_phongtro.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BuildingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BuildingFragment extends Fragment {

    private static final int REQUEST_CODE_PHONG_CHI_TIET = 1;
    private ListView lvPhongTro;
    private ArrayList<PhongTro> mListPhongTro;
    /*private PhongTroAdapter mPhongTroAdapter;*/

    // TODO: Rename parameter arguments, choose names that match
    Button btnAddBuilding;
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    SQLiteDatabase db;

    public BuildingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BuildingFragment newInstance(String param1, String param2) {
        BuildingFragment fragment = new BuildingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    public void onResume()
    {
        super.onResume();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_building, container, false);
        // Inflate the layout for this fragment
        btnAddBuilding = view.findViewById(R.id.btn_add_building);
        lvPhongTro = view.findViewById(R.id.lv_building);

        //lay danh sach phong tu co so du lieu va them vao mListPhongTro
       /* DBHelper dbHelper = new DBHelper(this.getContext());
        mListPhongTro = dbHelper.getAllPhong(); // Lấy danh sách tài khoản có role là 1
        mPhongTroAdapter = new PhongTroAdapter(this.getContext(),mListPhongTro);
        lvPhongTro.setAdapter(mPhongTroAdapter);*/

        //set onclick cho button add building
       /* btnAddBuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddPhongActivity.class);
                startActivity(intent);
            }
        });

        //set onclick cho listview
        lvPhongTro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PhongTro phongTro = mListPhongTro.get(position);
                Intent intent = new Intent(getActivity(), PhongChiTietActivity.class);
                intent.putExtra("phongtro", phongTro);
                startActivityForResult(intent, 1); // Sử dụng startActivityForResult thay vì startActivity
            }
        });*/


        return view;
    }

    /*@Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_PHONG_CHI_TIET && resultCode == RESULT_OK) {
            // Cập nhật lại dữ liệu trong ListView
            DBHelper dbHelper = new DBHelper(this);
            mListPhongTro.clear();
            mListPhongTro.addAll(dbHelper.getAllPhong());
            mPhongTroAdapter.notifyDataSetChanged();
        }
    }*/
}