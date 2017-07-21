package cn.com.immortals.model.convert;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Immortals.
 * @version 1.0.0
 */
public class ModelConvert<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModelConvert.class);

    public T convert(Object source, Class<? extends T> clazz) {
        try {
            T target = clazz.newInstance();
            BeanUtils.copyProperties(target, source);
            return target;
        } catch (Exception e) {
            LOGGER.error("model convert error", e);
        }
        return null;
    }

}
