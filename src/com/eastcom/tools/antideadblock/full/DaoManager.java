package com.eastcom.tools.antideadblock.full;

import com.eastcom.tools.antideadblock.dao.ExecuteLogDao;
import com.eastcom.tools.antideadblock.dao.GGSNDao;
import com.eastcom.tools.antideadblock.dao.GGSNTaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Rembau
 * Date: 13-9-4
 * Time: 下午12:33
 * To change this template use File | Settings | File Templates.
 */
public class DaoManager {
	public static GGSNTaskDao ggsnTaskDao;
	public static ExecuteLogDao executeLogDao;
	public static GGSNDao ggsnDao;

	public GGSNDao getGgsnDao() {
		return ggsnDao;
	}

	public void setGgsnDao(GGSNDao ggsnDao) {
		DaoManager.ggsnDao = ggsnDao;
	}

	public GGSNTaskDao getGgsnTaskDao() {
		return ggsnTaskDao;
	}

	public void setGgsnTaskDao(GGSNTaskDao ggsnTaskDao) {
		this.ggsnTaskDao = ggsnTaskDao;
	}

	public ExecuteLogDao getExecuteLogDao() {
		return executeLogDao;
	}

	public void setExecuteLogDao(ExecuteLogDao executeLogDao) {
		this.executeLogDao = executeLogDao;
	}
}
