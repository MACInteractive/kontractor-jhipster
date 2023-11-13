package com.mi.kontractor;

import com.mi.kontractor.config.AsyncSyncConfiguration;
import com.mi.kontractor.config.EmbeddedMongo;
import com.mi.kontractor.config.EmbeddedRedis;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { KontractorApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
