package com.sborm.example.bean;

import com.sborm.core.annotation.Table;
import com.sborm.core.grammar.QueryBuilder;
import org.springframework.stereotype.Component;
import com.sborm.core.grammar.QueryCondition;
import com.sborm.core.annotation.Column;
import com.sborm.core.grammar.OrderMode;
import java.util.Date;
import com.sborm.core.BaseEntity;
import java.io.Serializable;
import com.sborm.core.annotation.Database;

/**
 * Entity for table 'test.demo' generated by sborm
 * 
 * @author sborm
 * @date 2015-06-22 18:19:47
 */
@Database("test")
@Table("demo")
@Component
public class Demo extends BaseEntity implements Serializable {

	public static final long serialVersionUID = 6405509322884392287L;

	/**
	 * 表字段定义静态类
	 */
	public static final class Columns {
		public static final String id = "id";
		public static final String name = "name";
		public static final String password = "password";
		public static final String createTime = "create_time";
		public static final String type = "type";
	}

	/**
	 * 字段属性
	 */
	@Column("id")
	private Integer id;
	@Column("name")
	private String name;
	@Column("password")
	private String password;
	@Column("create_time")
	private Date createTime;
	@Column("type")
	private Integer type;

	public Demo() {
		super.queryBuilder = new QueryBuilder(this);
	}

	public void setId (Integer id) {
		this.id = id;
	}
	public Integer getId () {
		return this.id;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
	public void setPassword (String password) {
		this.password = password;
	}
	public String getPassword () {
		return this.password;
	}
	public void setCreateTime (Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime () {
		return this.createTime;
	}
	public void setType (Integer type) {
		this.type = type;
	}
	public Integer getType () {
		return this.type;
	}

	//////////////////////////////
	// 以下是自动组装查询条件相关的内部类
	//////////////////////////////
	public EntityQueryBuilder queryBuilder = new EntityQueryBuilder(this);

	public class EntityQueryBuilder {
		Demo entity = null;
		public EntityQueryBuilder(Demo obj) {
			entity = obj;
		}

		public void selectColumn(String ... columns) {
			entity.getQueryBuilder().columns().select(columns);
		}
		public EntityQueryBuilder whereIdEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.EQ(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdNEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.NEQ(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdGT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GT(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdGE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GE(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdLT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LT(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdLE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LE(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdLIKE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LIKE(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.IN(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdNOTIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.NOTIN(Columns.id, value));
			return this;
		}
		public EntityQueryBuilder whereIdBETWEEN (Object v1, Object v2) {
			entity.getQueryBuilder().where().add(QueryCondition.BETWEEN(Columns.id, v1, v2));
			return this;
		}
		public EntityQueryBuilder orderByIdASC () {
			entity.getQueryBuilder().order().add(Demo.Columns.id, OrderMode.ASC);
			return this;
		}
		public EntityQueryBuilder orderByIdDESC () {
			entity.getQueryBuilder().order().add(Demo.Columns.id, OrderMode.DESC);
			return this;
		}

		public EntityQueryBuilder whereNameEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.EQ(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameNEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.NEQ(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameGT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GT(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameGE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GE(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameLT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LT(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameLE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LE(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameLIKE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LIKE(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.IN(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameNOTIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.NOTIN(Columns.name, value));
			return this;
		}
		public EntityQueryBuilder whereNameBETWEEN (Object v1, Object v2) {
			entity.getQueryBuilder().where().add(QueryCondition.BETWEEN(Columns.name, v1, v2));
			return this;
		}
		public EntityQueryBuilder orderByNameASC () {
			entity.getQueryBuilder().order().add(Demo.Columns.name, OrderMode.ASC);
			return this;
		}
		public EntityQueryBuilder orderByNameDESC () {
			entity.getQueryBuilder().order().add(Demo.Columns.name, OrderMode.DESC);
			return this;
		}

		public EntityQueryBuilder wherePasswordEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.EQ(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordNEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.NEQ(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordGT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GT(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordGE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GE(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordLT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LT(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordLE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LE(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordLIKE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LIKE(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.IN(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordNOTIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.NOTIN(Columns.password, value));
			return this;
		}
		public EntityQueryBuilder wherePasswordBETWEEN (Object v1, Object v2) {
			entity.getQueryBuilder().where().add(QueryCondition.BETWEEN(Columns.password, v1, v2));
			return this;
		}
		public EntityQueryBuilder orderByPasswordASC () {
			entity.getQueryBuilder().order().add(Demo.Columns.password, OrderMode.ASC);
			return this;
		}
		public EntityQueryBuilder orderByPasswordDESC () {
			entity.getQueryBuilder().order().add(Demo.Columns.password, OrderMode.DESC);
			return this;
		}

		public EntityQueryBuilder whereCreateTimeEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.EQ(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeNEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.NEQ(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeGT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GT(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeGE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GE(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeLT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LT(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeLE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LE(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeLIKE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LIKE(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.IN(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeNOTIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.NOTIN(Columns.createTime, value));
			return this;
		}
		public EntityQueryBuilder whereCreateTimeBETWEEN (Object v1, Object v2) {
			entity.getQueryBuilder().where().add(QueryCondition.BETWEEN(Columns.createTime, v1, v2));
			return this;
		}
		public EntityQueryBuilder orderByCreateTimeASC () {
			entity.getQueryBuilder().order().add(Demo.Columns.createTime, OrderMode.ASC);
			return this;
		}
		public EntityQueryBuilder orderByCreateTimeDESC () {
			entity.getQueryBuilder().order().add(Demo.Columns.createTime, OrderMode.DESC);
			return this;
		}

		public EntityQueryBuilder whereTypeEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.EQ(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeNEQ (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.NEQ(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeGT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GT(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeGE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.GE(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeLT (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LT(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeLE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LE(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeLIKE (Object value) {
			entity.getQueryBuilder().where().add(QueryCondition.LIKE(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.IN(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeNOTIN (Object... value) {
			entity.getQueryBuilder().where().add(QueryCondition.NOTIN(Columns.type, value));
			return this;
		}
		public EntityQueryBuilder whereTypeBETWEEN (Object v1, Object v2) {
			entity.getQueryBuilder().where().add(QueryCondition.BETWEEN(Columns.type, v1, v2));
			return this;
		}
		public EntityQueryBuilder orderByTypeASC () {
			entity.getQueryBuilder().order().add(Demo.Columns.type, OrderMode.ASC);
			return this;
		}
		public EntityQueryBuilder orderByTypeDESC () {
			entity.getQueryBuilder().order().add(Demo.Columns.type, OrderMode.DESC);
			return this;
		}

	}
}
