import React from "react";

const Contact = () => {
  return (
    <div className="container mt-5">
      {/* Page Heading */}
      <div className="row mb-4">
        <div className="col text-center">
          <h1 className="fw-bold">Contact Us</h1>
          <p className="text-muted">
            We’d love to hear from you. Please fill out the form below.
          </p>
        </div>
      </div>

      <div className="row">
        {/* Contact Form */}
        <div className="col-md-6 mb-4">
          <form>
            <div className="mb-3">
              <label className="form-label">Full Name</label>
              <input
                type="text"
                className="form-control"
                placeholder="Enter your name"
              />
            </div>

            <div className="mb-3">
              <label className="form-label">Email address</label>
              <input
                type="email"
                className="form-control"
                placeholder="Enter your email"
              />
            </div>

            <div className="mb-3">
              <label className="form-label">Message</label>
              <textarea
                className="form-control"
                rows="4"
                placeholder="Write your message"
              ></textarea>
            </div>

            <button type="submit" className="btn btn-primary">
              Send Message
            </button>
          </form>
        </div>

        {/* Contact Info */}
        <div className="col-md-6">
          <div className="p-4 bg-light rounded">
            <h4 className="mb-3">Get in Touch</h4>
            <p className="text-muted mb-2">
              📍 Address: Your City, Your Country
            </p>
            <p className="text-muted mb-2">📧 Email: info@example.com</p>
            <p className="text-muted">📞 Phone: +91 98765 43210</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Contact;
