package service;

import domain.JDEmailConfigInstance;
import domain.JDInstance;

/**
 *
 *@author Kapitoha
 *
 */
public interface Actionable {
    public boolean saveInstance(JDInstance instance);
    public boolean removeInstance(int id, Class<JDInstance> instanceClass);
    public boolean updateInstance(JDInstance instance);
    public boolean sendEmail(String to, String subject, String message, JDEmailConfigInstance jdEmailConfigs);

}
