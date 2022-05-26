package com.example.api.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MCompanyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andSystemLoginIsNull() {
            addCriterion("system_login is null");
            return (Criteria) this;
        }

        public Criteria andSystemLoginIsNotNull() {
            addCriterion("system_login is not null");
            return (Criteria) this;
        }

        public Criteria andSystemLoginEqualTo(String value) {
            addCriterion("system_login =", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginNotEqualTo(String value) {
            addCriterion("system_login <>", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginGreaterThan(String value) {
            addCriterion("system_login >", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginGreaterThanOrEqualTo(String value) {
            addCriterion("system_login >=", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginLessThan(String value) {
            addCriterion("system_login <", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginLessThanOrEqualTo(String value) {
            addCriterion("system_login <=", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginLike(String value) {
            addCriterion("system_login like", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginNotLike(String value) {
            addCriterion("system_login not like", value, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginIn(List<String> values) {
            addCriterion("system_login in", values, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginNotIn(List<String> values) {
            addCriterion("system_login not in", values, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginBetween(String value1, String value2) {
            addCriterion("system_login between", value1, value2, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSystemLoginNotBetween(String value1, String value2) {
            addCriterion("system_login not between", value1, value2, "systemLogin");
            return (Criteria) this;
        }

        public Criteria andSharedSecretIsNull() {
            addCriterion("shared_secret is null");
            return (Criteria) this;
        }

        public Criteria andSharedSecretIsNotNull() {
            addCriterion("shared_secret is not null");
            return (Criteria) this;
        }

        public Criteria andSharedSecretEqualTo(String value) {
            addCriterion("shared_secret =", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretNotEqualTo(String value) {
            addCriterion("shared_secret <>", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretGreaterThan(String value) {
            addCriterion("shared_secret >", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretGreaterThanOrEqualTo(String value) {
            addCriterion("shared_secret >=", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretLessThan(String value) {
            addCriterion("shared_secret <", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretLessThanOrEqualTo(String value) {
            addCriterion("shared_secret <=", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretLike(String value) {
            addCriterion("shared_secret like", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretNotLike(String value) {
            addCriterion("shared_secret not like", value, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretIn(List<String> values) {
            addCriterion("shared_secret in", values, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretNotIn(List<String> values) {
            addCriterion("shared_secret not in", values, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretBetween(String value1, String value2) {
            addCriterion("shared_secret between", value1, value2, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andSharedSecretNotBetween(String value1, String value2) {
            addCriterion("shared_secret not between", value1, value2, "sharedSecret");
            return (Criteria) this;
        }

        public Criteria andPoUrlIsNull() {
            addCriterion("po_url is null");
            return (Criteria) this;
        }

        public Criteria andPoUrlIsNotNull() {
            addCriterion("po_url is not null");
            return (Criteria) this;
        }

        public Criteria andPoUrlEqualTo(String value) {
            addCriterion("po_url =", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlNotEqualTo(String value) {
            addCriterion("po_url <>", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlGreaterThan(String value) {
            addCriterion("po_url >", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("po_url >=", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlLessThan(String value) {
            addCriterion("po_url <", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlLessThanOrEqualTo(String value) {
            addCriterion("po_url <=", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlLike(String value) {
            addCriterion("po_url like", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlNotLike(String value) {
            addCriterion("po_url not like", value, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlIn(List<String> values) {
            addCriterion("po_url in", values, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlNotIn(List<String> values) {
            addCriterion("po_url not in", values, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlBetween(String value1, String value2) {
            addCriterion("po_url between", value1, value2, "poUrl");
            return (Criteria) this;
        }

        public Criteria andPoUrlNotBetween(String value1, String value2) {
            addCriterion("po_url not between", value1, value2, "poUrl");
            return (Criteria) this;
        }

        public Criteria andCxmlIdIsNull() {
            addCriterion("cxml_id is null");
            return (Criteria) this;
        }

        public Criteria andCxmlIdIsNotNull() {
            addCriterion("cxml_id is not null");
            return (Criteria) this;
        }

        public Criteria andCxmlIdEqualTo(String value) {
            addCriterion("cxml_id =", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdNotEqualTo(String value) {
            addCriterion("cxml_id <>", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdGreaterThan(String value) {
            addCriterion("cxml_id >", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdGreaterThanOrEqualTo(String value) {
            addCriterion("cxml_id >=", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdLessThan(String value) {
            addCriterion("cxml_id <", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdLessThanOrEqualTo(String value) {
            addCriterion("cxml_id <=", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdLike(String value) {
            addCriterion("cxml_id like", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdNotLike(String value) {
            addCriterion("cxml_id not like", value, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdIn(List<String> values) {
            addCriterion("cxml_id in", values, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdNotIn(List<String> values) {
            addCriterion("cxml_id not in", values, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdBetween(String value1, String value2) {
            addCriterion("cxml_id between", value1, value2, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlIdNotBetween(String value1, String value2) {
            addCriterion("cxml_id not between", value1, value2, "cxmlId");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordIsNull() {
            addCriterion("cxml_password is null");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordIsNotNull() {
            addCriterion("cxml_password is not null");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordEqualTo(String value) {
            addCriterion("cxml_password =", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordNotEqualTo(String value) {
            addCriterion("cxml_password <>", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordGreaterThan(String value) {
            addCriterion("cxml_password >", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cxml_password >=", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordLessThan(String value) {
            addCriterion("cxml_password <", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordLessThanOrEqualTo(String value) {
            addCriterion("cxml_password <=", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordLike(String value) {
            addCriterion("cxml_password like", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordNotLike(String value) {
            addCriterion("cxml_password not like", value, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordIn(List<String> values) {
            addCriterion("cxml_password in", values, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordNotIn(List<String> values) {
            addCriterion("cxml_password not in", values, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordBetween(String value1, String value2) {
            addCriterion("cxml_password between", value1, value2, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCxmlPasswordNotBetween(String value1, String value2) {
            addCriterion("cxml_password not between", value1, value2, "cxmlPassword");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(LocalDateTime value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(LocalDateTime value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(LocalDateTime value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(LocalDateTime value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<LocalDateTime> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<LocalDateTime> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(LocalDateTime value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(LocalDateTime value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(LocalDateTime value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(LocalDateTime value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<LocalDateTime> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<LocalDateTime> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}