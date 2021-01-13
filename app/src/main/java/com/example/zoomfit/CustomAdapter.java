package com.example.zoomfit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class CustomAdapter extends  RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private ArrayList<Coach> mData = new ArrayList<>();
    private LayoutInflater mInflater;
    private Context context;
    private ExerciseItemClickListener exerciseItemClickListener;

    CustomAdapter(Context context, ArrayList<Coach> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context = context;
    }

    public void setClickListeners(ExerciseItemClickListener exerciseItemClickListener) {
        this.exerciseItemClickListener = exerciseItemClickListener;
    }
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.rowview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        Coach coach = mData.get(position);
        holder.exercise_LBL_name.setText(coach.getName());
        holder.exercise_LBL_age.setText(coach.getAge());
        holder.exercise_LBL_type.setText(coach.getProfession());

    }

    @Override
    public int getItemCount() {
        if(mData == null){
            return -1;
        }
        return mData.size();
    }


    Coach getItem(int position) {
        return mData.get(position);
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

       // private ShapeableImageView exercise_IMG_icon;
        private TextView exercise_LBL_name;
        private TextView exercise_LBL_type;
        private TextView exercise_LBL_age ;
       // private TextView exercise_LBL_name;

        ViewHolder(View itemView) {
            super(itemView);
          //  exercise_IMG_icon = itemView.findViewById(R.id.exercise_IMG_icon);
            exercise_LBL_name= itemView.findViewById(R.id.exercise_LBL_name);
            exercise_LBL_type = itemView.findViewById(R.id.exercise_LBL_type);
            exercise_LBL_age = itemView.findViewById(R.id.exercise_LBL_age);
           // exercise_LBL_name = itemView.findViewById(R.id.exercise_LBL_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (exerciseItemClickListener != null) {
                        exerciseItemClickListener.itemClicked(getItem(getAdapterPosition()), getAdapterPosition());
                    }
                }
            });
        }

    }
    public interface ExerciseItemClickListener {
        void itemClicked(Coach coach, int position);
    }
}
