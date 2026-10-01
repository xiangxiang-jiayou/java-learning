package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JD implements Switch{
    private  String name;
    //状态：bool值
    private boolean status;//false 关


    @Override
    public void press() {
        //开关
           status=!status;
    }
}
