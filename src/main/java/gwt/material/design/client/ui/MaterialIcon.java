package gwt.material.design.client.ui;

import gwt.material.design.client.custom.ButtonBase;
import gwt.material.design.client.custom.HasIcons;
import gwt.material.design.client.custom.HasSeparator;
import gwt.material.design.client.type.IconType;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style.Unit;

//@formatter:off
/**
* We have included 740 Material Design Icons courtesy of Google. You can download them directly from the Material Design specs.
* <h3>UiBinder Usage:</h3>
* 
* <pre>
* {@code 
* <m:MaterialIcon waves="light" icon="polymer"/>
* <m:MaterialIcon waves="light" icon="polymer" textColor="blue" type="CIRCLE"/>
* <m:MaterialIcon waves="light" icon="polymer" backgroundColor="blue" textColor="white" type="CIRCLE" tooltip="Tooltip" tooltipLocation="bottom"/>
* }
* 
* </pre>
* 
* @author kevzlou7979
* @see <a href="http://www.google.com/design/icons/">Search Google Icons</a>
* @see <a href="http://gwt-material-demo.herokuapp.com/#icons">Material Icons Documentation</a>
*/
public class MaterialIcon extends ButtonBase implements HasSeparator, HasIcons{

	/**
	 * Creates an empty icon
	 */
	public MaterialIcon() {
		setElement(Document.get().createElement("i"));
		addStyleName("material-icons");
	}
	
	/**
	 * Sets a simple icon with black textcolor
	 * @param icon
	 */
	public MaterialIcon(String icon){
		this();
		setIcon(icon);
	}
	
	/**
	 * Sets an icon with textColor and backgroundColor
	 * @param icon
	 * @param textColor
	 * @param bgColor
	 */
	public MaterialIcon(String icon, String textColor, String bgColor){
		this();
		setIcon(icon);
		setTextColor(textColor);
		setBackgroundColor(bgColor);
	}
	
	@Override
	protected void onLoad() {
		// TODO Auto-generated method stub
		super.onLoad();
		initWaves();
		initTooltip();
	}

	@Override
	protected void onUnload() {
		// TODO Auto-generated method stub
		super.onUnload();
	}

	@Override
	public void setSeparator(boolean separator) {
		if (separator) {
			this.getElement().setAttribute("style", "border-bottom: 1px solid #e9e9e9;");
		}
	}


	@Override
	public void setIcon(String icon) {
		getElement().setInnerHTML(icon);
	}


	@Override
	public void setIconPosition(String iconPosition) {
		addStyleName(iconPosition);
	}


	@Override
	public void setSize(String size) {
		addStyleName(size);
	}
	
	@Override
	public void setWaves(String waves) {
		addStyleName("waves-effect waves-circle waves-" + waves);
		getElement().getStyle().setProperty("width", "initial");
		getElement().getStyle().setProperty("height", "auto");
		getElement().getStyle().setProperty("textAlign", "center");
		getElement().getStyle().setProperty("padding", "0.2em");
	}

	public void setType(IconType type) {
		switch (type) {
		case CIRCLE:
			getElement().getStyle().setPadding(0.2, Unit.EM);
			addStyleName("circle");
			break;

		default:
			break;
		}
	}

	@Override
	public void setIconColor(String iconColor) {
		addStyleName(iconColor + "-text");
	}

}
