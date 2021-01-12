package lt2021.sventes;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class DateAndTimeProvider {
	
	private Date date;
	@Autowired
	private ConfigurableApplicationContext applicationContext;
	
	public DateAndTimeProvider() {
		
	}

	public DateAndTimeProvider(Date date) {
		
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	protected void setDate(Date date) {
		this.date = date;
	}
	
	@PostConstruct
	private void postConstruct() {
		
		String[] names = applicationContext.getBeanFactory().getBeanNamesForType(this.getClass());
		String scope = applicationContext.getBeanFactory().getBeanDefinition(names[0]).getScope();
		Main.getLogger().info("Bean of " + this.getClass() + " and of scope " + scope + " was constructed");
	}
	
	@PreDestroy
	private void preDestroy() {
		
		
		String[] names = applicationContext.getBeanFactory().getBeanNamesForType(this.getClass());
		String scope = applicationContext.getBeanFactory().getBeanDefinition(names[0]).getScope();
		Main.getLogger().info("Bean of " + this.getClass() + " and of scope " + scope + " was destroyed");
	}	

}
