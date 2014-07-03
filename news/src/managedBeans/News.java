package managedBeans;
import java.sql.SQLException;
import java.util.List;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import org.primefaces.component.dashboard.Dashboard;
import org.primefaces.component.panel.Panel;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;
import Beans.CategoriaBean;
import Beans.NoticiaBean;
import DAO.CategoriaDAO;
import DAO.NoticiaDAO;

public class News {
	private String noticia;
	private String categoria;
    private MenuModel simpleMenuModel = new DefaultMenuModel();
    private DashboardModel model;
    private Dashboard dashboard;
    public static final int DEFAULT_COLUMN_COUNT = 3;
//    private int columnCount = DEFAULT_COLUMN_COUNT;
    private static final int columnCount = 4;
     
	public String noticia() 
	{
		return noticia;
	}
	public void init() throws SQLException 
    {
        model = new DefaultDashboardModel();
        NoticiaDAO noticia= new NoticiaDAO();
        List<NoticiaBean> noticias= noticia.getlastNews(5);
        for (NoticiaBean nt : noticias) {
			nt.getNoticia();
			nt.getresumen();
			DashboardColumn db = new DefaultDashboardColumn();
	        db.addWidget(nt.getDescripcion());
	    }
    }
	
	public void inicializar() throws SQLException {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application application = fc.getApplication();
 
        dashboard = (Dashboard) application.createComponent(fc, "org.primefaces.component.Dashboard", "org.primefaces.component.DashboardRenderer");
        dashboard.setId("dashboard");
 
        DashboardModel model = new DefaultDashboardModel();
        NoticiaDAO noticia= new NoticiaDAO();
        List<NoticiaBean> noticias= noticia.getlastNews(5);
        DashboardColumn column = new DefaultDashboardColumn();
        for (NoticiaBean nt : noticias) {
			
		}
        for( int i = 0, n = getColumnCount(); i < n; i++ ) {

            model.addColumn(column);
        }
        dashboard.setModel(model);
 
        int items = 5;
         
        for( int i = 0, n = items; i < n; i++ ) {
            Panel panel = (Panel) application.createComponent(fc, "org.primefaces.component.Panel", "org.primefaces.component.PanelRenderer");
            panel.setId("measure_" + i);
            panel.setHeader("Dashboard Component " + i);
            panel.setClosable(true);
            panel.setToggleable(true);
 
            getDashboard().getChildren().add(panel);
            DashboardColumn columns = model.getColumn(i%getColumnCount());
            columns.addWidget(panel.getId());
            HtmlOutputText text = new HtmlOutputText();
            text.setValue("Dashboard widget bits!" );
            panel.getChildren().add(text);
        }
    }
	public void setnoticia(String noticia) {
		this.noticia = noticia;
	}
	public String getcategoria() {
		return categoria;
	}
	public void setcategoria(String categoria) {
		this.categoria = categoria;
	}

	public  News() throws SQLException
	{
		CategoriaDAO cat= new CategoriaDAO();
		List<CategoriaBean> cats=cat.getCategorias(); 
		for (CategoriaBean categoriaBean : cats) {
			DefaultMenuItem menuItem = new DefaultMenuItem();
	        menuItem.setValue(categoriaBean.getNombre());
	        menuItem.setId(categoriaBean.getCategoria());
	        menuItem.setUrl("#");
	        simpleMenuModel.addElement(menuItem);
		}
		
		DefaultMenuItem menuItem = new DefaultMenuItem();
        menuItem.setValue("Login");
        menuItem.setId("login");
        menuItem.setOnclick("PF('dlg').show();");
        simpleMenuModel.addElement(menuItem);
        
	// adicionar Noticias
        model = new DefaultDashboardModel();
        NoticiaDAO noticia= new NoticiaDAO();
        List<NoticiaBean> noticias= noticia.getlastNews(5);
        for (NoticiaBean nt : noticias) {
			nt.getNoticia();
			nt.getresumen();
			DashboardColumn db = new DefaultDashboardColumn();
	        db.addWidget(nt.getDescripcion());
	        model.addColumn(db);
	    }
        dashboard.setModel(model);
	}

	public MenuModel getSimpleMenuModel() {
        return simpleMenuModel;
    }
	public DashboardModel getModel() {
        return model;
    }
	   public Dashboard getDashboard() {
	        return dashboard;
	    }
	 
	    public void setDashboard(Dashboard dashboard) {
	        this.dashboard = dashboard;
	    }
	 
	    public int getColumnCount() {
	        return columnCount;
	    }
	    private void addMessage(FacesMessage message) {
	        FacesContext.getCurrentInstance().addMessage(null, message);
	    }
	     
	    
}
