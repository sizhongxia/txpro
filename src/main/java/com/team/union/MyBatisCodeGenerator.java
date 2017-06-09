package com.team.union; /**
 * Created by sizho on 2017-5-8.
 */

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBatisCodeGenerator {

    private static Logger logger = LoggerFactory.getLogger(MyBatisCodeGenerator.class);

    public static void main(String[] args) {
        List<String> warnings = new ArrayList<String>();
        // 配置文件路径
        File configFile = new File(MyBatisGenerator.class.getResource("/mybatis/mybatis-builder.xml").getFile());

        logger.info("Mybatis Generator Config File Path: " + configFile.getPath());

        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {
            // 加载配置文件
            config = cp.parseConfiguration(configFile);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (XMLParserException e) {
            e.printStackTrace();
            return;
        }
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator mg = null;
        try {
            // 构建
            mg = new MyBatisGenerator(config, callback, warnings);
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
        try {
            logger.info("Start Generator");
            mg.generate(new ProgressCallback() {
                @Override
                public void introspectionStarted(int i) {
                    logger.info("Introspection > " + i);
                }

                @Override
                public void generationStarted(int i) {
                    logger.info("Generator > " + i);
                }

                @Override
                public void saveStarted(int i) {
                    logger.info("Save > " + i);
                }

                @Override
                public void startTask(String s) {
                    logger.info("Start Task > " + s);
                }

                @Override
                public void done() {
                    logger.info("Build Done!");
                }

                @Override
                public void checkCancel() throws InterruptedException {
                    logger.info("Check Cancel!");
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}