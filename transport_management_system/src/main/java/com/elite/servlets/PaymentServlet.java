@WebServlet("/payment")
public class PaymentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to payment.jsp for displaying the form
        request.getRequestDispatcher("/templates/payment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the payment details from the form
        String cardNumber = request.getParameter("cardNumber");
        String expiryDate = request.getParameter("expiryDate");
        String cvv = request.getParameter("cvv");

        // Here, you would typically validate and process the payment
        // For example, calling a payment API or saving the payment to a database.

        // Redirect to a success page (e.g., payment confirmation)
        response.sendRedirect("paymentSuccess.jsp");
    }
}
