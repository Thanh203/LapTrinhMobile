package com.example.doannhom1.model;

import android.app.Application;

import java.util.ArrayList;

public class MonAnData extends Application {
    MonAnDB monAnDB;
    @Override
    public void onCreate(){
        super.onCreate();
        monAnDB = new MonAnDB(this);
        monAnDB.createTable();
        if (monAnDB.countMonAn() ==  0){
            monAnDB.insertMonAn("Gà ủ muối tiêu chanh",
                    "    - 500g đường \n     - 500gam muối \n    - 500g ớt",
                    "   Pha tất cả các nguyên liệu theo tỷ lệ ở trên là 1:1:1:5 có nghĩa là 1 thìa nước mắm, 1 thìa đường, 1 thìa giấm, 5 thìa nước lọc. Bạn hòa tan nước mắm, đường và dấm trước sau đó mới cho thêm tỏi, ớt và rắc thêm ít tiêu vào, nước mắm nêm sẽ có vị ngọt, vị chua, vị mặn. Cách làm: Cho tỏi, ớt, sả, gừng vào cối giã nhỏ.",
//                    "https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                    "https://www.youtube.com/watch?v=HJiRzTmn5X4",
                    "Thanh123.jpg", 1);
            monAnDB.insertMonAn("Công thức 2","123", "123456","","Thanh123.jpg", 1);
            monAnDB.insertMonAn("Công thức 3","321", "654321","","Thanh123.jpg", 1);
            monAnDB.insertMonAn("Công thức 4","", "","","Thanh123.jpg", 1);
            monAnDB.insertMonAn("Công thức 5","", "","","Thanh123.jpg", 1);
            monAnDB.insertMonAn("Công thức 6","", "","","Thanh123.jpg", 1);
        }
    }
    public static ArrayList<MonAn> getMonAn(){
        ArrayList<MonAn> lstMonAn = new ArrayList<>();
        lstMonAn.add( new MonAn(1, "Gà ủ muối tiêu chanh","500g đường \n 500gam muối \n 500g ớt",
                "Pha tất cả các nguyên liệu theo tỷ lệ ở trên là 1:1:1:5 có nghĩa là 1 thìa nước mắm, 1 thìa đường, 1 thìa giấm, 5 thìa nước lọc. Bạn hòa tan nước mắm, đường và dấm trước sau đó mới cho thêm tỏi, ớt và rắc thêm ít tiêu vào, nước mắm nêm sẽ có vị ngọt, vị chua, vị mặn. Cách làm: Cho tỏi, ớt, sả, gừng vào cối giã nhỏ.",null,"Thanh123.jpg", 1));
        lstMonAn.add( new MonAn(2, "Thịt heo luột",null, null,null,"Thanh123.jpg", 1));
        lstMonAn.add( new MonAn(3, "Mắm ớt tỏi",null, null,null,"Thanh123.jpg", 1));
        lstMonAn.add( new MonAn(4, "Canh khổ qua",null, null,null,"Thanh123.jpg", 1));
        lstMonAn.add( new MonAn(5, "Canh rau tập tàng",null, null,null,"Thanh123.jpg", 1));
        lstMonAn.add( new MonAn(6, "Muối tiêu chanh",null, null,null,"Thanh123.jpg", 1));
        lstMonAn.add( new MonAn(7, "Muối ớt hải sản",null, null,null,"Thanh123.jpg", 1));
        return lstMonAn;
    }
}
