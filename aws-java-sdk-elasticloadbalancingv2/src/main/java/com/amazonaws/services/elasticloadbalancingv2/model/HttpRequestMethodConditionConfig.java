/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/HttpRequestMethodConditionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpRequestMethodConditionConfig implements Serializable, Cloneable {

    private java.util.List<String> values;

    /**
     * @return
     * @see HttpRequestMethodEnum
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * @param values
     * @see HttpRequestMethodEnum
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpRequestMethodEnum
     */

    public HttpRequestMethodConditionConfig withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * @param values
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpRequestMethodEnum
     */

    public HttpRequestMethodConditionConfig withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * @param values
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpRequestMethodEnum
     */

    public HttpRequestMethodConditionConfig withValues(HttpRequestMethodEnum... values) {
        java.util.ArrayList<String> valuesCopy = new java.util.ArrayList<String>(values.length);
        for (HttpRequestMethodEnum value : values) {
            valuesCopy.add(value.toString());
        }
        if (getValues() == null) {
            setValues(valuesCopy);
        } else {
            getValues().addAll(valuesCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRequestMethodConditionConfig == false)
            return false;
        HttpRequestMethodConditionConfig other = (HttpRequestMethodConditionConfig) obj;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public HttpRequestMethodConditionConfig clone() {
        try {
            return (HttpRequestMethodConditionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
