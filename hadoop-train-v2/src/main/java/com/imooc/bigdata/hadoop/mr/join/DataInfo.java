package com.imooc.bigdata.hadoop.mr.join;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Author: Michael PK
 */
public class DataInfo implements Writable{

    private String data;
    private String flag;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeUTF(flag);
        out.writeUTF(data);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        this.flag = in.readUTF();
        this.data = in.readUTF();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
