/**
 * 
 */
package com.alithya.notification.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author gnaoussi
 *
 */
@Component
@ConfigurationProperties(prefix="comment")
public class CommentProperties {

}
