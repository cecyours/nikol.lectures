import React, { useEffect, useState } from "react";
import { useParams } from "react-router";

const UserView = () => {
  const { id } = useParams();

  const [user, setUser] = useState(null);
  const [loading, setLoading] = useState(true);

  const fetchUser = async () => {
    try {
      const res = await fetch(
        "https://jsonplaceholder.typicode.com/users/" + id
      );
      const data = await res.json();
      setUser(data);
    } catch (error) {
      console.error("Error fetching user:", error);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchUser();
  }, [id]);

  if (loading) {
    return (
      <div className="container mt-5 text-center">
        <div className="spinner-border text-primary" role="status"></div>
      </div>
    );
  }

  if (!user) {
    return (
      <div className="container mt-5">
        <div className="alert alert-danger">User not found</div>
      </div>
    );
  }

  return (
    <div className="container mt-5">
      <div className="card shadow-lg border-0">
        <div className="card-header bg-primary text-white">
          <h3 className="mb-0">{user.name}</h3>
          <small>@{user.username}</small>
        </div>

        <div className="card-body">
          {/* Contact Info */}
          <h5 className="text-primary mb-3">Contact Information</h5>
          <div className="row mb-4">
            <div className="col-md-6">
              <p>
                <strong>Email:</strong> {user.email}
              </p>
              <p>
                <strong>Phone:</strong> {user.phone}
              </p>
              <p>
                <strong>Website:</strong>{" "}
                <a
                  href={`https://${user.website}`}
                  target="_blank"
                  rel="noreferrer"
                >
                  {user.website}
                </a>
              </p>
            </div>
          </div>

          {/* Address */}
          <h5 className="text-primary mb-3">Address</h5>
          <div className="row mb-4">
            <div className="col-md-12">
              <p className="mb-1">
                {user.address.street}, {user.address.suite}
              </p>
              <p className="mb-1">
                {user.address.city} - {user.address.zipcode}
              </p>
              <p className="text-muted">
                Lat: {user.address.geo.lat}, Lng: {user.address.geo.lng}
              </p>
            </div>
          </div>

          {/* Company */}
          <h5 className="text-primary mb-3">Company Details</h5>
          <div className="row">
            <div className="col-md-12">
              <p>
                <strong>Name:</strong> {user.company.name}
              </p>
              <p>
                <strong>Catch Phrase:</strong>{" "}
                <span className="badge bg-success">
                  {user.company.catchPhrase}
                </span>
              </p>
              <p>
                <strong>Business:</strong> {user.company.bs}
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default UserView;
