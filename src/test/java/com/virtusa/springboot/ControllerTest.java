package com.virtusa.springboot;

import com.virtusa.springboot.repository.AdminRepository;
import com.virtusa.springboot.repository.UserRepository;
import com.virtusa.springboot.service.AdminService;
import com.virtusa.springboot.web.AdminController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {
@InjectMocks
	 private AdminController adminController = new AdminController();

	@Mock
	private AdminService adminService;
	@Mock
	private UserRepository userrepo;
	@Mock
	private AdminRepository adminrepo;
	
	@Test
	void AdminLoginTest(){
		Assertions.assertEquals("AdminLogin",adminController.AdminLogin());
	}

	@Test
	void viewHomePageTest()
	{
		Model model = new Model() {
			@Override
			public Model addAttribute(String attributeName, Object attributeValue) {
				return null;
			}

			@Override
			public Model addAttribute(Object attributeValue) {
				return null;
			}

			@Override
			public Model addAllAttributes(Collection<?> attributeValues) {
				return null;
			}

			@Override
			public Model addAllAttributes(Map<String, ?> attributes) {
				return null;
			}

			@Override
			public Model mergeAttributes(Map<String, ?> attributes) {
				return null;
			}

			@Override
			public boolean containsAttribute(String attributeName) {
				return false;
			}

			@Override
			public Object getAttribute(String attributeName) {
				return null;
			}

			@Override
			public Map<String, Object> asMap() {
				return null;
			}
		};
		Assertions.assertEquals("AdminAddMovies", adminController.viewHomePage(model));
	}
	@Test
	 void showNewMovieFormTest() {
		Model model = new Model() {
			@Override
			public Model addAttribute(String attributeName, Object attributeValue) {
				return null;
			}

			@Override
			public Model addAttribute(Object attributeValue) {
				return null;
			}

			@Override
			public Model addAllAttributes(Collection<?> attributeValues) {
				return null;
			}

			@Override
			public Model addAllAttributes(Map<String, ?> attributes) {
				return null;
			}

			@Override
			public Model mergeAttributes(Map<String, ?> attributes) {
				return null;
			}

			@Override
			public boolean containsAttribute(String attributeName) {
				return false;
			}

			@Override
			public Object getAttribute(String attributeName) {
				return null;
			}

			@Override
			public Map<String, Object> asMap() {
				return null;
			}
		};
		String response = adminController.showNewMovieForm(model);
		Assertions.assertEquals("addMovieInfo", response);
	}
    @Test
	 void saveAdminTest() {
	com.virtusa.springboot.model.Admin admin = new com.virtusa.springboot.model.Admin();
		String response = adminController.saveAdmin(admin);
		Assertions.assertEquals("redirect:/", response);

	}
	@Test
	 void showFormForUpdateTest() {
	Model model = new Model() {
		@Override
		public Model addAttribute(String attributeName, Object attributeValue) {
			return null;
		}

		@Override
		public Model addAttribute(Object attributeValue) {
			return null;
		}

		@Override
		public Model addAllAttributes(Collection<?> attributeValues) {
			return null;
		}

		@Override
		public Model addAllAttributes(Map<String, ?> attributes) {
			return null;
		}

		@Override
		public Model mergeAttributes(Map<String, ?> attributes) {
			return null;
		}

		@Override
		public boolean containsAttribute(String attributeName) {
			return false;
		}

		@Override
		public Object getAttribute(String attributeName) {
			return null;
		}

		@Override
		public Map<String, Object> asMap() {
			return null;
		}
	};
		String response = adminController.showFormForUpdate(1,model);
		Assertions.assertEquals("update_movie", response);
	}
	@Test
	 void deleteEmployee() {
		String response = adminController.deleteEmployee(12);
		Assertions.assertEquals("redirect:/", response);
	}

}
