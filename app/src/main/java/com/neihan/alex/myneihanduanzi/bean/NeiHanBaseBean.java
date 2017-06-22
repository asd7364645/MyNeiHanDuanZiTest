package com.neihan.alex.myneihanduanzi.bean;

import java.util.List;

/**
 * Created by Alex on 2017/6/19.
 * Alex
 */

public class NeiHanBaseBean<T> {

    private String message;
    private DataBean<T> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean<T> getData() {
        return data;
    }

    public void setData(DataBean<T> data) {
        this.data = data;
    }

    public static class DataBean<T> {
        private boolean has_more;
        private String tip;
        private boolean has_new_message;
        private double max_time;
        private int min_time;
        private List<T> data;

        public boolean isHas_more() {
            return has_more;
        }

        public void setHas_more(boolean has_more) {
            this.has_more = has_more;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }

        public boolean isHas_new_message() {
            return has_new_message;
        }

        public void setHas_new_message(boolean has_new_message) {
            this.has_new_message = has_new_message;
        }

        public double getMax_time() {
            return max_time;
        }

        public void setMax_time(double max_time) {
            this.max_time = max_time;
        }

        public int getMin_time() {
            return min_time;
        }

        public void setMin_time(int min_time) {
            this.min_time = min_time;
        }

        public List<T> getData() {
            return data;
        }

        public void setData(List<T> data) {
            this.data = data;
        }
    }
}
