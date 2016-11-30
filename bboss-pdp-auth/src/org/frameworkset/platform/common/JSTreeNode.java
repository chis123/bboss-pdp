/**
 * 
 */
package org.frameworkset.platform.common;

import java.util.Map;

/**
 * 封装树节点对象
 * @author yinbp { id : "string" // will be autogenerated if omitted text :
 *         "string" // node text icon : "string" // string for custom state : {
 *         opened : boolean // is the node open disabled : boolean // is the
 *         node disabled selected : boolean // is the node selected }, children
 *         : [] // array of strings or objects li_attr : {} // attributes for
 *         the generated LI node a_attr : {} // attributes for the generated A
 *         node }
 * @Date:2016-11-28 18:14:38
 */
public class JSTreeNode {

	private String id;// will be autogenerated if omitted
	private String text;// node text
	private String icon; // string for custom
	/**
	 * { boolean opened ; : boolean // is the node open disabled : boolean // is
	 * the node disabled selected : boolean // is the node selected }
	 */
	private TreeNodeStage state;

	/**
	 * List<JSTreeNode>:有数据
	 * true：ajax异步加载时判断是否有下级节点，有则为true，否则为false
	 */
	private Object children; // array of strings or objects
	private Map<String, String> li_attr; // attributes for the generated LI node
	private Map<String, String> a_attr; // attributes for the generated A node

	/**
	 * 
	 */
	public JSTreeNode() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public TreeNodeStage getState() {
		return state;
	}

	public void setState(TreeNodeStage state) {
		this.state = state;
	}

	public Object getChildren() {
		return children;
	}

	public void setChildren(Object children) {
		this.children = children;
	}

	public Map<String, String> getLi_attr() {
		return li_attr;
	}

	public void setLi_attr(Map<String, String> li_attr) {
		this.li_attr = li_attr;
	}

	public Map<String, String> getA_attr() {
		return a_attr;
	}

	public void setA_attr(Map<String, String> a_attr) {
		this.a_attr = a_attr;
	}

}
