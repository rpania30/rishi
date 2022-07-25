package gov.dhs.cisa.flare.misp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class TestFile {
    private static final Logger log = LoggerFactory.getLogger(TestFile.class);

    public static String getValidTestXmlFile() {
        StringBuilder sbf = new StringBuilder();

        try {
            File f = new File("test-file-01.xml");
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // if (data != null && data.indexOf("9999-12-31T00:00:00") != -1) {
                // data = data.replaceAll("9999-12-31T00:00:00", new Date().toString());
                // log.info("++++++++++++++++++++++++++++++++" + data);
                // }
                sbf.append(data + "\n");
            }
            myReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // log.info("\n\n\n" + sbf.toString() + "\n\n\n");
        return sbf.toString();
    }
}
