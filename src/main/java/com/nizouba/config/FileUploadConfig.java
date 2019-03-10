package com.nizouba.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zwxbest on 2019/3/10.
 */

@Component
@ConfigurationProperties(prefix = "upload-file.visit")
public class FileUploadConfig {

    private String path;
}
