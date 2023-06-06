package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // �����, ����������� �� ����� ������������
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    // ���������� ������������, � ������� �������������� ViewResolver, ��� ����������� ����������� jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* ������ ����� ��������� url, �� ������� ����� ������������ ���������� */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}