// Gerenciamento do Formulário de Agendamento
document.getElementById('appointmentForm').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const name = document.getElementById('name').value;
    const service = document.getElementById('service').value;
    const date = document.getElementById('date').value;

    // Simulação de envio
    alert(`Sucesso! Olá ${name}, recebemos seu pedido para ${service} no dia ${date}. Aguarde nosso contato.`);
    
    this.reset();
});

// Efeito de Transparência no Header ao rolar a página
window.addEventListener('scroll', function() {
    const header = document.querySelector('header');
    if (window.scrollY > 50) {
        header.style.background = '#000';
        header.style.padding = '0.8rem 5%';
    } else {
        header.style.background = 'rgba(18, 18, 18, 0.95)';
        header.style.padding = '1rem 5%';
    }
});
