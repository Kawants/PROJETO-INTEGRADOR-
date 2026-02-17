package com.mycompany.barber99.controller;

import com.mycompany.barber99.model.Agendamento;
import jakarta.persistence.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/agendar")
public class AgendamentoServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("nome");
        String servico = request.getParameter("servico");
        String data = request.getParameter("data");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("barberPU");
        EntityManager em = emf.createEntityManager();

        Agendamento a = new Agendamento();
        a.setCliente(nome);
        a.setServico(servico);
        a.setDataHora(data);

        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();

        em.close();
        emf.close();

        response.sendRedirect("sucesso.html");
    }
}