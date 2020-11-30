package com.dayang.service.impl;

import com.dayang.domain.StandardTwoInfo;
import com.dayang.service.ABClonalService;
import com.dayang.utils.Tools;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.entity.ContentType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ABClonalServiceImpl implements ABClonalService {

    private static final String SOURCEFIlEPATH = "C:\\Users\\Administrator\\Desktop\\网站数据下载\\source.xls";

    @Override
    public void getABClonalProduct() {
        try {
            MultipartFile multipartFile = getMultipartFile();
            if (multipartFile == null) {
                return;
            }
            List<String[]> list = Tools.readExcel(multipartFile);
            getStandardTwoList(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取MultipartFile对象
     *
     * @return
     * @throws IOException
     */
    private MultipartFile getMultipartFile() throws IOException {
        File sourceFile = new File(SOURCEFIlEPATH);
        if (!sourceFile.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        MultipartFile multipartFile = new MockMultipartFile(sourceFile.getName(), sourceFile.getName(),
                ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
        return multipartFile;
    }

    private List<StandardTwoInfo> getStandardTwoList(List<String[]> list) {
        List<StandardTwoInfo> standardTwoInfoList = new ArrayList<>();
        for (String[] arrays : list) {
            StandardTwoInfo info = new StandardTwoInfo();
            info.setNumber(arrays[0]);
            info.setItemNumber(arrays[1]);
            info.setName(arrays[2]);
            info.setRevisedName(arrays[3]);
            info.setSpecies(arrays[4]);
            info.setType(arrays[5]);
            info.setVerifyApplication(arrays[6]);
            info.setReactiveSpecies(arrays[7]);
            info.setPrice50ul(arrays[8]);
            info.setPrice100ul(arrays[9]);
            info.setPrice200ul(arrays[10]);
            if (!standardTwoInfoList.contains(info)) {
                standardTwoInfoList.add(info);
            }
        }
        log.info("==>> standardTwoInfoList: " + standardTwoInfoList);
        return standardTwoInfoList;
    }
}
